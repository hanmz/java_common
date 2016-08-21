package hanmz.common.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by hanmz on 2016/8/21.
 */
public class DateUtil {
  private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS");
  private static int offset = 8;

  public static void main(String[] args) {

  }

  // 取当前日期
  public static String obtainLocalDate() {
    LocalDate today = LocalDate.now();
    return today.toString();
  }

  //根据年月日取日期
  public static String conLocalDate(int year, int mouth, int day) {
    LocalDate date = LocalDate.of(year, mouth, day);
    return date.toString();
  }

  // 获取时间
  public static String obtainLocalTime() {
    LocalTime now = LocalTime.now().withNano(0);
    return now.toString();
  }

  // 获取日期时间
  public static String obtainLocalDateTime() {
    LocalDateTime localDateTime = LocalDateTime.now();
    return localDateTime.toString();
  }

  // 获取yyyy-MM-dd HH-mm-SS
  public static String obtainYmdHms1() {
    return obtainLocalDate() + " " + obtainLocalTime();
  }

  // 获取yyyy-MM-dd HH-mm-SS
  public static String obtainYmdHms2() {
    LocalDateTime localDateTime = LocalDateTime.now();
    return localDateTime.format(formatter);
  }

  // 带时区的时间
  public static String obtainUtc(String zoneId) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
    return zonedDateTime.format(formatter);
  }

  // 根据时区进行位移的时间
  public static String obtainUtcOffset() {
    LocalDateTime localDateTime = LocalDateTime.now().plusHours(-offset);
    return localDateTime.format(formatter);
  }
}
