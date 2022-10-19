package io.corretto.board.controller;

import io.corretto.board.domain.ArticleDto;
import io.corretto.board.domain.AttachmentDto;
import io.corretto.board.domain.BoardDto;
import io.corretto.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/write")
    public String write(){ return "boardWrite"; }

    @PostMapping("/write")
    public String write(ArticleDto articleDto, Model m, RedirectAttributes rattr){
        LocalDateTime date = LocalDateTime.now().withNano(0);

        articleDto.setCreated_datetime(date);

        try{
            int rowCnt = boardService.write(articleDto);
            int rowCnt2 = 0;

            int id = boardService.selectId(articleDto);
            System.out.println("출력" + id);
            AttachmentDto attachmentDto = new AttachmentDto();

            for (int i=0; i<3; i++){
                attachmentDto.setArticle_id(articleDto.getId());
                attachmentDto.setCreated_datetime(date);
                attachmentDto.setLocation("/document/attachment/" + i);

                rowCnt2 = boardService.attachment(attachmentDto);
            }

            if(rowCnt!=1 || rowCnt2!=1){
                throw new Exception("Write failed");
            }

            rattr.addFlashAttribute("msg", "WRT_OK");

            return "redirect:/boardList";

        } catch(Exception e){
            e.printStackTrace();
            m.addAttribute("msg", "WRT_ERR");

            return "board";
        }
    }

}
