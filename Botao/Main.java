public class Main {
    public static void main(String[] args) {
        DefaultButton rectBtn = new RectButton();
        rectBtn.setWidth(400f);
        rectBtn.setHeight(100f);
        rectBtn.setPositionX((1920f / 2) - (rectBtn.getWidth() / 2));
        rectBtn.setPositionY((1080f / 2 )  - rectBtn.getHeight() / 2);
        rectBtn.setColor(Color.GREEN);
        rectBtn.setText("abriR");

        if(rectBtn.isPressed()) {
            System.out.println("O arquivo está sendo aberto");
        }
        rectBtn.setPressed(false);

        System.out.println("Imprimindo informações do botão retangular");
        System.out.println("Largura: " + rectBtn.getWidth() + " | Altura: " + rectBtn.getHeight());
        System.out.println("Posição X: " + rectBtn.getPositionX() + " | Posição Y: " + rectBtn.getPositionY());
        System.out.println("Cor: " + rectBtn.getColor());
        System.out.println("Texto: " + rectBtn.getText());

        DefaultButton roundBtn = new RoundButton();
        roundBtn.setWidth(150f);
        roundBtn.setHeight(150f);
        roundBtn.setPositionX((1920f / 2) - (roundBtn.getWidth() / 2));
        roundBtn.setPositionY((1080f / 2 )  - roundBtn.getHeight() / 2);
        roundBtn.setCornerRadius(roundBtn.getWidth() / 2);
        roundBtn.setColor(Color.BLUE);
        roundBtn.setText("ok");

        if(roundBtn.isPressed()) {
            System.out.println("OK");
        }
        roundBtn.setPressed(false);

        System.out.println("Imprimindo informações do botão redondo");
        System.out.println("Largura: " + roundBtn.getWidth() + " | Altura: " + roundBtn.getHeight());
        System.out.println("Posição X: " + roundBtn.getPositionX() + " | Posição Y: " + roundBtn.getPositionY());
        System.out.println("Cor: " + roundBtn.getColor());
        System.out.println("Texto: " + roundBtn.getText());
    }
}