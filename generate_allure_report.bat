@echo off
set path=C:\Users\MuhammadSultan\.m2\repository\allure\allure-2.18.1\bin;C:\Program Files\Java\jdk-17.0.4\bin;%path%
allure serve allure-results
pause
exit