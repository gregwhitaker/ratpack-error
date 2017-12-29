/*
 * Copyright 2017 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.gregwhitaker.ratpack.error;

/**
 * Base exception that all handled exceptions must extend in order to be handled correctly.
 */
public abstract class BaseException extends RuntimeException {
    private int status = 500;
    private String errorCode;
    private String errorMessage = "An error occurred. Please contact support.";
    private String errorDetail;
    private String errorDetailUrl;

    public BaseException() {
        // Noop
    }

    public BaseException(int status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public BaseException(int status, String errorCode, String errorMessage) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(int status, String errorCode, String errorMessage, String errorDetail) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
    }

    public BaseException(int status, String errorCode, String errorMessage, String errorDetail, String errorDetailUrl) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
        this.errorDetailUrl = errorDetailUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getErrorDetailUrl() {
        return errorDetailUrl;
    }

    public void setErrorDetailUrl(String errorDetailUrl) {
        this.errorDetailUrl = errorDetailUrl;
    }
}

