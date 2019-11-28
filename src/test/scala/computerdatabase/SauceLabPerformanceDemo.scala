package saucelab

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SauceLabPerformanceDemo extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.saucedemo.com")
		.inferHtmlResources(BlackList(), WhiteList())

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"cache-control" -> "max-age=0",
		"if-modified-since" -> "Thu, 14 Mar 2019 21:39:04 GMT",
		"if-none-match" -> "e5c31c4fa5d89d01f8fb7276c8a7331d",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")

	val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")

	val headers_5 = Map(
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")

	val headers_14 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")



	val scn = scenario("SauceLabPerformanceDemo")
		.exec(http("SauceLabPerformanceDemo_0")
			.get("/index.html")
			.headers(headers_0)
			.resources(http("SauceLabPerformanceDemo_1")
			.get("/css/sample-app-web.css")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_2")
			.get("/main.js")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_3")
			.get("/img/SwagLabs_logo.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0003_response.png"))),
            http("SauceLabPerformanceDemo_4")
			.get("/img/Login_Bot_graphic.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0004_response.png")))))
		.pause(23)
		.exec(http("SauceLabPerformanceDemo_5")
			.get("/inventory.html")
			.headers(headers_5)
			.resources(http("SauceLabPerformanceDemo_6")
			.get("/css/sample-app-web.css")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_7")
			.get("/main.js")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_8")
			.get("/img/SwagLabs_logo.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0008_response.png"))),
            http("SauceLabPerformanceDemo_9")
			.get("/img/twitter.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0009_response.png"))),
            http("SauceLabPerformanceDemo_10")
			.get("/img/facebook.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0010_response.png"))),
            http("SauceLabPerformanceDemo_11")
			.get("/img/linkedIn.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0011_response.png"))),
            http("SauceLabPerformanceDemo_12")
			.get("/img/SwagBot_Footer_graphic.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0012_response.png"))),
            http("SauceLabPerformanceDemo_13")
			.get("/img/peek.png")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0013_response.png"))),
            http("SauceLabPerformanceDemo_14")
			.get("/img/red-tatt-1200x1500.jpg")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0014_response.jpeg"))),
            http("SauceLabPerformanceDemo_15")
			.get("/img/red-onesie-1200x1500.jpg")
			.headers(headers_14)
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0015_response.jpeg"))),
            http("SauceLabPerformanceDemo_16")
			.get("/img/sauce-backpack-1200x1500.jpg")
			.headers(headers_14),
            http("SauceLabPerformanceDemo_17")
			.get("/img/bolt-shirt-1200x1500.jpg")
			.headers(headers_14),
            http("SauceLabPerformanceDemo_18")
			.get("/img/bike-light-1200x1500.jpg")
			.headers(headers_14),
            http("SauceLabPerformanceDemo_19")
			.get("/img/sauce-pullover-1200x1500.jpg")
			.headers(headers_14)))
		.pause(4)
		.exec(http("SauceLabPerformanceDemo_20")
			.get("/cart.html")
			.headers(headers_5)
			.resources(http("SauceLabPerformanceDemo_21")
			.get("/css/sample-app-web.css")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_22")
			.get("/main.js")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_23")
			.get("/img/SwagLabs_logo.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0023_response.png"))),
            http("SauceLabPerformanceDemo_24")
			.get("/img/twitter.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0024_response.png"))),
            http("SauceLabPerformanceDemo_25")
			.get("/img/facebook.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0025_response.png"))),
            http("SauceLabPerformanceDemo_26")
			.get("/img/linkedIn.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0026_response.png"))),
            http("SauceLabPerformanceDemo_27")
			.get("/img/SwagBot_Footer_graphic.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0027_response.png")))))
		.pause(2)
		.exec(http("SauceLabPerformanceDemo_28")
			.get("/checkout-step-one.html")
			.headers(headers_5)
			.resources(http("SauceLabPerformanceDemo_29")
			.get("/css/sample-app-web.css")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_30")
			.get("/main.js")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_31")
			.get("/img/SwagLabs_logo.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0031_response.png"))),
            http("SauceLabPerformanceDemo_32")
			.get("/img/twitter.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0032_response.png"))),
            http("SauceLabPerformanceDemo_33")
			.get("/img/facebook.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0033_response.png"))),
            http("SauceLabPerformanceDemo_34")
			.get("/img/linkedIn.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0034_response.png"))),
            http("SauceLabPerformanceDemo_35")
			.get("/img/SwagBot_Footer_graphic.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0035_response.png")))))
		.pause(7)
		.exec(http("SauceLabPerformanceDemo_36")
			.get("/checkout-step-two.html")
			.headers(headers_5)
			.resources(http("SauceLabPerformanceDemo_37")
			.get("/css/sample-app-web.css")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_38")
			.get("/main.js")
			.headers(headers_1),
            http("SauceLabPerformanceDemo_39")
			.get("/img/SwagLabs_logo.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0039_response.png"))),
            http("SauceLabPerformanceDemo_40")
			.get("/img/twitter.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0040_response.png"))),
            http("SauceLabPerformanceDemo_41")
			.get("/img/facebook.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0041_response.png"))),
            http("SauceLabPerformanceDemo_42")
			.get("/img/linkedIn.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0042_response.png"))),
            http("SauceLabPerformanceDemo_43")
			.get("/img/SwagBot_Footer_graphic.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0043_response.png")))))
		.pause(3)
		.exec(http("SauceLabPerformanceDemo_44")
			.get("/checkout-complete.html")
			.headers(headers_5)
			.resources(http("SauceLabPerformanceDemo_45")
			.get("/css/sample-app-web.css")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0045_response.css"))),
            http("SauceLabPerformanceDemo_46")
			.get("/main.js")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0046_response.js"))),
            http("SauceLabPerformanceDemo_47")
			.get("/img/SwagLabs_logo.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0047_response.png"))),
            http("SauceLabPerformanceDemo_48")
			.get("/img/pony-express.png")
			.headers(headers_1)
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0048_response.png"))),
            http("SauceLabPerformanceDemo_49")
			.get("/img/twitter.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0049_response.png"))),
            http("SauceLabPerformanceDemo_50")
			.get("/img/facebook.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0050_response.png"))),
            http("SauceLabPerformanceDemo_51")
			.get("/img/linkedIn.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0051_response.png"))),
            http("SauceLabPerformanceDemo_52")
			.get("/img/SwagBot_Footer_graphic.png")
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0052_response.png"))))
			.check(bodyBytes.is(RawFileBody("saucelab/saucelabperformancedemo/0044_response.html"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}