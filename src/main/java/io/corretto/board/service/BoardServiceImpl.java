package io.corretto.board.service;

import io.corretto.board.dao.BoardDao;
import io.corretto.board.domain.ArticleDto;
import io.corretto.board.domain.AttachmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardDao boardDao;

    @Override
    public int write(ArticleDto articleDto) throws Exception {
        return boardDao.insert(articleDto);
    }

    @Override
    public int attachment(AttachmentDto attachmentDto) throws Exception {
         return boardDao.attachment(attachmentDto);
    }

    @Override
    public int selectId(ArticleDto articleDto) throws Exception {
        return boardDao.selectId(articleDto);
    }
}
