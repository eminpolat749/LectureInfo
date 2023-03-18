package org.csystem.app.school.lecture;

import org.csystem.app.date.DateUtil;

public class LectureInfoParser {
    public LectureInfo lectureInfo;

    public static String getDateStr(String str)
    {
        String [] dateInfo = str.split("[/]");

        int day = Integer.parseInt(dateInfo[0]);
        int month = Integer.parseInt(dateInfo[1]);
        int year = Integer.parseInt(dateInfo[2]);

        return DateUtil.getDateStrTR(day, month, year);
    }

    public LectureInfoParser(String str) //ctor
    {
        String [] lectureInfoStr = str.split("[:]+");

        lectureInfo = new LectureInfo();
        lectureInfo.studentName = lectureInfoStr[0];
        lectureInfo.name = lectureInfoStr[1];
        lectureInfo.midtermDate = getDateStr(lectureInfoStr[2]);
        lectureInfo.finalDate = getDateStr(lectureInfoStr[3]);
        lectureInfo.finalGrade = Integer.parseInt(lectureInfoStr[4]);
        lectureInfo.finalGrade = Integer.parseInt(lectureInfoStr[5]);

    }

}
