package edu.s16222.kata9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppKata9Test
{
	AppKata9 app = new AppKata9();
@Test
public void test_totals() {
    assertEquals(  0, app.price(""));
    assertEquals( 50, app.price("A"));
    assertEquals( 80, app.price("AB"));
    assertEquals(115, app.price("CDBA"));

    assertEquals(100, app.price("AA"));
    assertEquals(130, app.price("AAA"));
    assertEquals(180, app.price("AAAA"));
    assertEquals(230, app.price("AAAAA"));
    assertEquals(260, app.price("AAAAAA"));

    assertEquals(160, app.price("AAAB"));
    assertEquals(175, app.price("AAABB"));
    assertEquals(190, app.price("AAABBD"));
    assertEquals(190, app.price("DABABA"));
    }



  public void test_incremental() {
	  AppKata9 co = new AppKata9();
	  assertEquals(  0, co.total());
    co.scan("A");  assertEquals( 50, co.total());
    co.scan("B");  assertEquals( 80, co.total());
    co.scan("A");  assertEquals(130, co.total());
    co.scan("A");  assertEquals(160, co.total());
    co.scan("B");  assertEquals(175, co.total());
  }
}