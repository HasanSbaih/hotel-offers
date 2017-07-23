package com.expedia.exercise.development;


public interface UseCase <T extends Request,R extends  Response> {

    void execute (T request,R response);
}
