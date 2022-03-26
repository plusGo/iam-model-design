package com.henry.iam.service;

import com.henry.iam.model.Condition;
import com.henry.iam.model.Identity;
import com.henry.iam.model.Access;
import com.henry.iam.model.Context;
import com.henry.iam.model.po.Resource;
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
