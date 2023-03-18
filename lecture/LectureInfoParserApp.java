package org.csystem.app.school.lecture;

public class LectureInfoParserApp {
    public static void printLectureInfo(LectureInfo lectureInfo)
    {
        int grade = lectureInfo.getGrade();

        System.out.printf("Ad Soyad:%s%n", lectureInfo.studentName);
        System.out.printf("Ders Adı:%s%n", lectureInfo.name);
        System.out.printf("Ara Sınav Tarihi:%s%n", lectureInfo.midtermDate);
        System.out.printf("Final Tarihi:%s%n", lectureInfo.finalDate);
        System.out.printf("Ara Sınav Notu:%d%n", lectureInfo.midtermGrade);
        System.out.printf("Final Notu:%d%n", lectureInfo.finalGrade);
        System.out.printf("Geçme Notu:%d%n", grade);
        System.out.printf("Sonuç:%s%n", grade >= 50 ? "Geçti" : "Kaldı");

    }
}
