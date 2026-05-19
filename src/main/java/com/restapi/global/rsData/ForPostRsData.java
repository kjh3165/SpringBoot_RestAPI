package com.restapi.global.rsData;

import com.restapi.domain.post.post.dto.PostDto;

public record ForPostRsData(String resultCode, String msg, PostDto data) {
}
