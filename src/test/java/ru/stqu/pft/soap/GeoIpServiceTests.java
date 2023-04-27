package ru.stqu.pft.soap;

import com.lavasoft.GeoIPService;
import org.testng.annotations.Test;



public class GeoIpServiceTests {
  @Test
  public void testMyIp () {
    String geoIP = new GeoIPService().getGeoIPServiceSoap12().getIpLocation20("95.182.119.94");
    System.out.println(geoIP);

  }
}
