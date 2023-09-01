package com.cydeo.repository;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;

public class DBCommentRepository implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Storing comment "+comment.getText());
    }
}
