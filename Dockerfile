FROM nginx AS server
COPY ./resources/public /usr/share/nginx/html
EXPOSE 80
