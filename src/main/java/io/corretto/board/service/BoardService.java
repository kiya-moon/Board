package io.corretto.board.service;

import io.corretto.board.domain.ArticleDto;
import io.corretto.board.domain.AttachmentDto;

public interface BoardService {
    int write(ArticleDto articleDto) throws Exception;

    int attachment(AttachmentDto attachmentDto) throws Exception;

    int selectId(ArticleDto articleDto) throws Exception;
}
