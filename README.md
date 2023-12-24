# 자바프로그래밍

## JavaSrc.zip 파일을 내려받고 이클립스에서 import 하세요.

이클립스에서 아래의 절차를 따르세요.
1. File 메뉴 아래의 import 메뉴를 선택<br>
   ![image](https://github.com/hjk7902/java/assets/13778400/7a018663-7e3c-423e-9f19-563dab49d4ac)
3. General 항목 아래의 [Existing Projects into Workspace] 선택<br>
   ![image](https://github.com/hjk7902/java/assets/13778400/6f9f39cd-8a04-4070-9aa7-97558379dfce)
4. [Select archive file:]을 선택한 후 내려받은 JavaSrc.zip 파일을 선택<br>
   ![image](https://github.com/hjk7902/java/assets/13778400/e6335cda-3d0e-4955-9dd6-155041f41839)
5. 프로젝트들이 체크되어 있는 것을 확인한 후 [Finish]
   만일 프로젝트가 선택되지 않는다면 현재 이클립스 워크스페이스(workspace)에 같은 이름의 프로젝트가 있기 때문입니다. 같은 이름의 프로젝트가 워크스페이스에 존재할 수 없습니다.

## 프로젝트에 빨간색 느낌표 보일 때
### JRE System Library가 잘못되어 있을 경우

1. 프로젝트에서 마우스 오른쪽 버튼 -> Build Path -> Configure Build Path<br>
2. Java Build Path창에서 <br>
  2-1. Libraries 탭 누르고<br>
  2-2. Modulepath 항목 아래의 빨간색 보이는 라이브러리(JRE System Library) 선택하고 Remove<br>
  2-3. 다시 Modulepath항목 선택하고 오른쪽 [Add Library] 버튼 클릭<br>
  2-4. JRE System Library 선택 후 Next 버튼 클릭<br>
  2-5. Execution enviromment: JavaSE-21 선택(unbound가 아닌 가장 최근 항목으로 선택), Finish<br>
3. Java Build Path 창에서 Apply and Close 버튼 눌러 적용<br>
