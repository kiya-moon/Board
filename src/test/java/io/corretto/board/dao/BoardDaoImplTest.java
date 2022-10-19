package io.corretto.board.dao;

import io.corretto.board.domain.ArticleDto;
import io.corretto.board.domain.AttachmentDto;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoImplTest {
    @Autowired
    private BoardDao boardDao;

    @Test
    public void insertTest() throws Exception {
        boardDao.deleteArticleAll();

        LocalDateTime date = LocalDateTime.now().withNano(0);
        ArticleDto articleDto = new ArticleDto();
        articleDto.setBoard_id(1);
        articleDto.setContent("test content");
        articleDto.setCreated_datetime(date);
        articleDto.setTitle("test title");
        assertTrue(boardDao.insert(articleDto)==1);

    }

    @Test
    public void attachment() throws Exception{

        LocalDateTime date = LocalDateTime.now().withNano(0);
        ArticleDto articleDto = new ArticleDto();
        articleDto.setBoard_id(1);
        articleDto.setContent("test content");
        articleDto.setCreated_datetime(date);
        articleDto.setTitle("test title");

        boardDao.deleteAttachmentAll();

        AttachmentDto attachmentDto = new AttachmentDto();
        int id = boardDao.selectId(articleDto);
        System.out.println(id + "출력");
        attachmentDto.setArticle_id(boardDao.selectId(articleDto));
        attachmentDto.setLocation("/document/attachment/test");
        attachmentDto.setCreated_datetime(date);

        assertTrue(boardDao.attachment(attachmentDto)==1);
    }
}