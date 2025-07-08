# invent-ory
a project for inventory prices

Basic-information:
The repository has 4 branches. Development is ongoing. Dev and prod branches are a group. They satisfy and were built for a particular way the project needed to be executed. The other branch, a.k.a offline-dev is for another idea of how the project needed to work. 

Tech stack: The dev and prod branches indicate heavy dependence on Amazon Web Services (AWS). The applications used were:
1. S3
     a. Angular frontend and S3 image link.
3. EC2
     a. Elastic IPs
     b. Nginx
4. Aurora and RDS
     a. Two instances of one DB were used. One isntance was a writer and the other was reader.
5. Route 53
     a. Used to buy the domain name for the client, 1 hosted zone. It had two links, one for frontend and the other for backend APIs.     
6. Cloudfront
     a. For SSL/TLS certificates and to orient data transmission between AWS applications and domain.
     b. Made two different cloudfront distributions to engage traffic accordingly to different websites depending on whether it is frontend or backend.
