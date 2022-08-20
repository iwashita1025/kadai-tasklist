package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasks;

public class MessageValidator {
    // バリデーションを実行する
    public static List<String> validate(Tasks t) {
        List<String> errors = new ArrayList<String>();

        String taskname_error = validateTitle(t.getTaskname());
        if(!taskname_error.equals("")) {
            errors.add(taskname_error);
        }

        String content_error = validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // タイトルの必須入力チェック
    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    // メッセージの必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "メッセージを入力してください。";
        }

        return "";
    }
}