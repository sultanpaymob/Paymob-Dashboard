#!/bin/bash
parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "/Users/muhammadsultan/.m2/repository/allure/allure-2.18.1/bin/"
bash allure serve "$parent_path/allure-results"
exit