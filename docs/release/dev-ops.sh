# 部署脚本

## 一、前置条件

- 域名 自行申请和配置。
- 云服务器 2c4g https://618.gaga.plus - 1M带宽即可，便宜。
- ssl1；https://certificate-console.jdcloud.com/jsecssl/create?fastConfig=false&certBrand=TrustAsia&certType=domainType&protectionType=DV-1&gDomainCount=0
- ssl2；https://bugstack.cn/md/road-map/ssl-httpsok.html

## 二、执行脚本

git clone -b docker-images-v1.0 https://gitcode.net/KnowledgePlanet/s-pay-mall/s-pay-mall-mvc.git

mvn clean install

docker-compose -f docker-compose-environment.yml up -d

docker-compose -f docker-compose-app.yml up -d

## 三、