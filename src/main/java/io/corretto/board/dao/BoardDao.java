package io.corretto.board.dao;

import io.corretto.board.domain.ArticleDto;
import io.corretto.board.domain.AttachmentDto;

public interface BoardDao {
    int insert(ArticleDto articleDto) throws Exception;

    int attachment(AttachmentDto attachmentDto) throws Exception;

    int deleteArticleAll() throws Exception;

    int deleteAttachmentAll() throws Exception;

    int selectId(ArticleDto articleDto) throws Exception;
}
