# အခြေခံအနေနဲ့ Java ပါပြီးသား ပေါ့ပေါ့ပါးပါး OS တစ်ခုကို သုံးမယ်
FROM eclipse-temurin:17-jdk-alpine

# App ကိုထားမယ့် folder ဆောက်မယ်
WORKDIR /usr/app

# မင်း ခုနက build လုပ်လို့ထွက်လာတဲ့ JAR ဖိုင်ကို Container ထဲ ကူးထည့်မယ်
# သတိထားရန်: နာမည်ကို မင်းရဲ့ target folder ထဲကအတိုင်း အတိအကျရေးပါ
COPY maven-demo/target/maven-demo-1.0-SNAPSHOT.jar app.jar

# App က port 8080 မှာ အလုပ်လုပ်မှာမို့လို့ ဖွင့်ပေးထားမယ်
EXPOSE 8080

# Container စတာနဲ့ Java App ကို run ခိုင်းမယ်
ENTRYPOINT ["java", "-jar", "app.jar"]