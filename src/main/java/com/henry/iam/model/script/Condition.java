package com.henry.iam.model.script;

import com.henry.iam.model.Context;

/**
 * 条件
 */
public interface Condition {
    Boolean execute(final Context context);
}
