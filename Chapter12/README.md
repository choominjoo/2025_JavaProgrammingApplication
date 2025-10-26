# 📘 9주차 자바 그래픽 (Java Programming Application - Week 9)

## 🧩 1. 스윙 컴포넌트 그리기 (Swing Component Drawing)

### 🎨 paintComponent(Graphics g)
- 모든 **스윙 컴포넌트(JComponent)** 가 가지는 메서드.
- 컴포넌트의 모양을 직접 그릴 때 사용.
- 호출 시점:
  - 처음 화면에 그려질 때
  - 크기/위치가 변경될 때
  - 다른 창에 가려졌다 다시 드러날 때
  - `repaint()` 호출 시

### ✅ 사용 예시
```java
class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(10, 10, 50, 50);
    }
}
🖌️ 2. Graphics 클래스
주요 기능

좌표 체계: (0,0) 기준 왼쪽 상단

문자열 출력: drawString(String str, int x, int y)

색상 설정: setColor(Color c)

폰트 설정: setFont(Font f)

Font f = new Font("Arial", Font.ITALIC, 30);
g.setFont(f);
g.setColor(Color.RED);
g.drawString("Hello, Java!", 30, 30);

🟢 3. 도형 그리기와 칠하기 (Shapes and Fills)
도형 메소드

drawRect(), drawOval(), drawArc(), drawPolygon()

fillRect(), fillOval(), fillArc(), fillPolygon()

g.setColor(Color.BLUE);
g.fillRect(10, 10, 50, 50);

🖼️ 4. 이미지 그리기 (Drawing Images)
두 가지 방식

JLabel + ImageIcon

간단하지만 크기 조절 불가.

Graphics.drawImage()

자유로운 크기 조절과 부분 이미지 가능.

ImageIcon icon = new ImageIcon("images/image0.jpg");
Image img = icon.getImage();
g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

✂️ 5. 클리핑 (Clipping)

특정 영역만 그리기 가능.

g.setClip(100, 20, 150, 150);
g.drawImage(img, 0, 0, getWidth(), getHeight(), this);


clipRect()를 여러 번 호출하면 교집합 영역으로 축소됨.

🔄 6. 스윙의 페인팅 메커니즘
페인팅 호출 구조
paint(Graphics g) {
    paintComponent(g);  // 내부 모양
    paintBorder(g);     // 테두리
    paintChildren(g);   // 자식 컴포넌트
}

repaint() & revalidate()

repaint() : 컴포넌트를 다시 그림.

revalidate() : 배치관리자에게 컴포넌트 재배치 요청.

🖱️ 예제: 마우스로 선 그리기
addMouseListener(new MouseAdapter() {
    public void mousePressed(MouseEvent e) { vStart.add(e.getPoint()); }
    public void mouseReleased(MouseEvent e) { vEnd.add(e.getPoint()); repaint(); }
});
