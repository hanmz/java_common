package hanmz.common.date;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hanmz on 2016/8/21.
 */
public class DateUtilTest {
  @Test
  public void obtainYmdHms() throws Exception {
    System.out.println(DateUtil.obtainUtcOffset1());
  }

  @Test
  public void obtainLocalDateTime() throws Exception {
    System.out.println(DateUtil.obtainLocalDateTime());
  }

  @Test
  public void obtainLocalTime() throws Exception {
    System.out.println(DateUtil.obtainLocalTime());
  }

  @Test
  public void localDate() throws Exception {
    System.out.println(DateUtil.conLocalDate(2016,8,21));
  }

}
