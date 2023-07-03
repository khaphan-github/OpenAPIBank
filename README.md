# BANKING OPEN API - DOMAIN DRIVEN DESIGN
## 1. Features:
- 
## 2. Project structure:
## 3. Swagger config:
https://openbanking.atlassian.net/wiki/spaces/DZ/pages/1150124033/Directory+2.0+Technical+Overview+v1.6
#### Endpoint:
- **GET**: **/api/v1/open-banking/public-key**
    + **Header**:
        - Authorization: 'eyJhbGciOiJIUzI1...Qssw5c'
    + **desc**: Get public key to encrypt transaction encrypt method using ECC
    + **Response**:
   `   {
      "id": "6616caf4-2c53-4408-8470-9221d75b928b",
      "timestamp": "2023-07-03T09:23:56.424+00:00",
      "status": 200,
      "message": "Success",
      "data": "YOUR_PUBLIC_KEY"
      } `



- **POST**: **/api/v1/open-banking/auth**
    + **Body**:
      `{
      "credential": "aTRsE1phCk5... JVe",
      "publicKey": "MIGfMA0GCSqGSIb3DQEBAQUAA4G...jK2UtdwIDAQAB"
      }`
    + **desc**: Service login


- **GET**: **/api/v1/open-banking/transfer-history?page=1&size=10**
    + **Header**:
        - Authorization: 'eyJhbGciOiJIUzI1...Qssw5c'
    + **desc**: Get transfer history.


- **POST**: **/api/v1/open-banking/transfer**
    + **Header**:
        - Authorization: 'eyJhbGciOiJIUzI1...Qssw5c'
    + **Body**:
      ` {
      "from": "068704070000489",
      "to": "003704070000276",
      "amount": 900000,
      "description": "Transfer description ..."
      }`
    + **desc**: Do transfer.

## 4. Analytic:
### 
