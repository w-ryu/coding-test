package org.cian.exam.coding;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = new_id.toLowerCase().replaceAll("[^(._\\-)(a-z0-9)\\s]", "");
        answer = answer.replaceAll("[.]+", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        if(answer.equals("")){
            answer = "a";
        }

        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");

        while(answer.length() < 3) {
            answer += answer.substring(answer.length() - 1);
        }
    }
}
