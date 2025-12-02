package com.test.TemplateEngineExample.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment(){
        count++;
    }
}
