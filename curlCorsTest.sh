#curl -H "Origin: http://example.com" --verbose http://192.168.59.103:8080/service/customer/

curl -H "Origin: http://example.com" -H "Access-Control-Request-Method: GET" -H "Access-Control-Request-Headers: X-Requested-With" \
  -X OPTIONS --verbose http://192.168.59.103:8080/service/customer/ 
