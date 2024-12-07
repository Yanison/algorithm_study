## 백준 3003번 KQLBNF 풀이
- [백준 3003번](https://www.acmicpc.net/problem/3003) 문제


나의 풀이


```java
public static void main1(String[] args) throws IOException { // 메모리 14372 KM 시간 100 ms
        int[] arr = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i : arr){
            sb.append(i - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);
    }

    public static void main2(String[] args) throws IOException { // 메모리 15860 KM 시간 116 ms
        int[] arr = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i : arr){
            System.out.print((i - Integer.parseInt(st.nextToken())) + " ");
        }
    }

    public static void main3(String[] args) throws IOException { // 메모리 16860 KM 시간 156 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l = br.readLine().trim();
        String[] nums = l.split(" ");
        System.out.println(
                (1-Integer.parseInt(nums[0])) + " "
                        + (1-Integer.parseInt(nums[1])) + " "
                        + (2-Integer.parseInt(nums[2]))+ " "
                        + (2-Integer.parseInt(nums[3]))+ " "
                        + (2-Integer.parseInt(nums[4])) + " "
                        + (8-Integer.parseInt(nums[5]))
        );
    }
    
```

- main1 // 메모리 14372 KM 시간 100 ms
  - StringBuilder를 사용하였기 때문에 메모리를 효율적으로 사용 가능(String은 수정될 때마다 새로운 객체 생성함)
  - StringTokenizer를 사용해서 토큰을 얻으면 추가 메모리를 소모하지만 크지 않음
- main2 // 메모리 15860 KM 시간 116 ms
  - StringBuilder와 StringTokenizer를 사용했지만 반복문을 통해서 System.out.print을 계속 출력하기 때문에 메모리를 더 사용함 
- main3 // 메모리 16860 KM 시간 156 ms
  - split을 사용해서 문자열을 나누어서 사용했지만 추가 배열을 생성하기 때문에 메모리를 더 사용함
  - StringTokenizer를 사용해서 접근하는것이 split보다 메모리를 덜 사용함