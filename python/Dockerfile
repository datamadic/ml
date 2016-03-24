FROM python:2.7
ADD requirements.txt ./requirements.txt
RUN pip install -r ./requirements.txt
ADD . /code
WORKDIR /code
EXPOSE 5000
CMD ["python", "app.py"]