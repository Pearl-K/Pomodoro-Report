# Pomodoro Report
개인의 포모도로 세션 정보를 가지고 분석 리포트를 만들어주는 서비스

---
## 설계
1. 아키텍처
2. 도메인

---
## 1. 아키텍처
- Layered Architecture
- Domain Driven Design


---
## 2. 도메인
- User
- PomodoroSession
- PomodoroReport

### User
사용자 정보를 담는다.

- userId: Long (PK)
- email
- nickname
- pomodoroTimeSetting (value object)
  - workTime
  - shortRestTime
  - longRestTime


### PomodoroSession
사용자의 포모도로 세션 정보를 담는다.

- sessionId: Long (PK)
- userId
- topic
- type (ENUM - WORK, SHORT_REST, LONG_REST)
- startTime
- endTime


### PomodoroReport
사용자의 포모도로 리포트 정보를 담는다. 콘텐츠 안에는 리포트의 세부 내용이 있다.

- reportDate
- userId
- type (ENUM - DAILY, WEEKLY, MONTHLY)
- startTime
- endTime
- content



