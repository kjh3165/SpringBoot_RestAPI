package com.restapi.global.rsData;

import com.restapi.domain.post.postComment.dto.PostCommentDto;

public record RsData(String resultCode, String msg, PostCommentDto data) {
}
