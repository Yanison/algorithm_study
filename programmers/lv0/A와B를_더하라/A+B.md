# A+B


## StringTokenizer
<table style="border-collapse: collapse; width: 100%;" border="1" data-ke-style="style12" data-ke-align="alignLeft">
 <tbody>
  <tr>
   <td style="width: 15.7752%;">리턴값</td>
   <td style="width: 22.1705%;">메서드명</td>
   <td style="width: 62.0542%;">역할</td>
  </tr>
  <tr>
   <td style="width: 15.7752%;">boolean</td>
   <td style="width: 22.1705%;">hasMoreTokens()</td>
   <td style="width: 62.0542%;">남아있는 토큰이 있으면 true를 리턴, 더 이상 토큰이 없으면 false 리턴</td>
  </tr>
  <tr>
   <td style="width: 15.7752%;">String</td>
   <td style="width: 22.1705%;">nextToken()</td>
   <td style="width: 62.0542%;">객체에서 다음 토큰을 반환</td>
  </tr>
  <tr>
   <td style="width: 15.7752%;">String</td>
   <td style="width: 22.1705%;">nextToken(String delim)</td>
   <td style="width: 62.0542%;">delim 기준으로 다음 토큰을 반환</td>
  </tr>
  <tr>
   <td style="width: 15.7752%;">boolean</td>
   <td style="width: 22.1705%;">hasMoreElements()</td>
   <td style="width: 62.0542%;">hasMoreTokens와 동일한데 엘리먼트보다 토큰으로 된 메서드를 주로 사용</td>
  </tr>
  <tr>
   <td style="width: 15.7752%;">Object</td>
   <td style="width: 22.1705%;">nextElement()</td>
   <td style="width: 62.0542%;">nextToken 메서드와 동일하지만 문자열이 아닌 객체를 리턴</td>
  </tr>
  <tr>
   <td style="width: 15.7752%;">int</td>
   <td style="width: 22.1705%;">countTokens()</td>
   <td style="width: 62.0542%;">총 토큰의 개수를 리턴</td>
  </tr>
 </tbody>
</table>

```java
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        //StringTokenizer st = new StringTokenizer("문자열", "구분자","구분자도 토큰으로 반환 여부(기본값 false)");
        StringTokenizer st = new StringTokenizer();// 매개변수가 없을경우 공백으로 구분
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
```

## StringTokenizer와 split의 차이
StringTokenizer는 java.util에 포함되어 있는 클래스, split은 String 클래스에 속해있는 메소드입니다.
StringTokenizer는 문자 또는 문자열로 문자열을 구분하지만, split은 정규식을 이용하여 문자열을 구분합니다.
StringTokenizer는 빈 문자열을 토큰으로 인식하지 않지만 split은 빈 문자열도 토큰으로 인식합니다.
StringTokenizer는 결과값이 문자열이지만, split은 결과값이 문자열 배열입니다.
따라서 StringTokenizer를 이용할 경우 전체 토큰을 보고싶다면 반복문을 이용해 하나하나 뽑아야합니다.