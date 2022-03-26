package com.henry.iam.model;

/**
 * 条件
 */
public interface Condition {
    Boolean execute(final Context context);
}
