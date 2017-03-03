package com.expedia.exercise.development;

/**
 * Created by u562 on 3/1/2017.
 */
public interface UseCase <T extends Request,R extends  Response> {

    void execute (T request,R response);
}
