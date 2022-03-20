$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium/Selenium_Workspace/BDDwithPOM/src/main/java/qa/features/fb_login.feature");
formatter.feature({
  "line": 1,
  "name": "FB Application Test",
  "description": "",
  "id": "fb-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Without Examples"
    }
  ],
  "line": 4,
  "name": "FB login test",
  "description": "",
  "id": "fb-application-test;fb-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open browser and go to url of login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Facebook - Log In or Sign Up",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify FB logo is present",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on logIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user see error message",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FB_Login_Steps.user_open_browser_and_go_to_url_of_login_page()"
});
formatter.result({
  "duration": 2605554800,
  "status": "passed"
});
formatter.match({
  "location": "FB_Login_Steps.title_of_login_page_is_Facebook_Log_In_or_Sign_Up()"
});
formatter.result({
  "duration": 7120200,
  "status": "passed"
});
formatter.match({
  "location": "FB_Login_Steps.verify_FB_logo_is_present()"
});
formatter.result({
  "duration": 504999,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat qa.pages.FB_Login_Page.validate_Fb_Logo(FB_Login_Page.java:39)\r\n\tat qa.stepDefinition.FB_Login_Steps.verify_FB_logo_is_present(FB_Login_Steps.java:26)\r\n\tat ✽.Then verify FB logo is present(C:/Selenium/Selenium_Workspace/BDDwithPOM/src/main/java/qa/features/fb_login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FB_Login_Steps.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FB_Login_Steps.user_click_on_logIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FB_Login_Steps.user_see_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FB_Login_Steps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});