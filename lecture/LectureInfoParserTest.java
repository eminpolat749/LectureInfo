package org.csystem.app.school.lecture;

import java.util.Scanner;

public class LectureInfoParserTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.printf("Formatlı yazıyı giriniz:");
            String str = kb.nextLine();

            if ("elma".equals(str))
                break;

            LectureInfoParser parser = new LectureInfoParser(str);
            LectureInfo lectureInfo = parser.lectureInfo;

            LectureInfoParserApp.printLectureInfo(lectureInfo);
        }
        System.out.println("Tekrar yapıyor musunuz?");
    }

    public static void main(String[] args)
    {
        run();
    }

}
