package com.ours.base.exception;

import lombok.*;

/**
 * @author ls
 * @date 2019-05-20 22:52
 * @description
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "message")
public class BaseException extends RuntimeException {
    private Integer code = 500;

    private String message;
}
