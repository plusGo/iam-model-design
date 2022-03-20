package com.henry.service;

import com.henry.model.Access;
import com.henry.model.Condition;
import com.henry.model.Context;
import com.henry.model.Identity;
import com.henry.model.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IAMService {

    void authorize(final Identity identity, final Resource resource, final Context context){

    }

    Access getAccess(final Identity identity, final Resource resource, final Context context) {
        new Thread() {

        };
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).run();
        ArrayList<Condition> conditions = new ArrayList<>();
        conditions.add(new Condition() {
            @Override
            public Boolean execute(final Context context) {
                return null;
            }
        });
        return null;
    }
}
