package io.corretto.board.dao;

import io.corretto.board.domain.ArticleDto;
import io.corretto.board.domain.AttachmentDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    private SqlSession session;
    private static String namespace = "io.corretto.board.dao.BoardMapper.";

    @Override
    public int insert(ArticleDto articleDto) throws Exception {
        return session.insert(namespace+"insert", articleDto);
    }

    @Override
    public int attachment(AttachmentDto attachmentDto) throws Exception {
        return session.insert(namespace+"attachmentInsert", attachmentDto);
    }

    @Override
    public int deleteArticleAll() throws Exception {
        return session.delete(namespace+"deleteArticleAll");
    }

    @Override
    public int deleteAttachmentAll() throws Exception {
        return session.delete(namespace+"deleteAttachmentAll");
    }

    @Override
    public int selectId(ArticleDto articleDto) throws Exception {
        return session.selectOne(namespace+"selectId");
    }


}
