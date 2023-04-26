public abstract class DefaultButton implements Button {
    protected Color color;
    protected String text;
    private boolean pressed;
    protected float posX;
    protected float posY;
    private float width;
    private float height;
    private float cornerRadius;

    public abstract void setText(String text);

    public float getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean isPressed() {
        return pressed;
    }

    @Override
    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setPositionX(float posX) {
        if(posX <= 0 || posX >= 1920) {
            System.out.println("Posição inválida!");
            return;
        }
        this.posX = posX;
    }

    @Override
    public void setPositionY(float posY) {
        if(posY <= 0 || posY >= 1080) {
            System.out.println("Posição inválida!");
            return;
        }
        this.posY = posY;
    }

    @Override
    public float getPositionX() {
        return posX;
    }

    @Override
    public float getPositionY() {
        return posY;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
