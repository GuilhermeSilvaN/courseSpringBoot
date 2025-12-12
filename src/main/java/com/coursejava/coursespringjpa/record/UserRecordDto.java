package com.coursejava.coursespringjpa.record;

public record UserRecordDto(
        String name,
        String email,
        String phone,
        String password
) {
}
