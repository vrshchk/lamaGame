package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.StartClass;

public class ChoiceScreen implements Screen {

    private StartClass startClass;
    private Stage stage;

    Image backgroundImage;
    Image grassImage;
    Image sittingLamaImage;
    Label choiceLabel;
    ImageButton oneLevel;
    ImageButton twoLevel;
    ImageButton threeLevel;
    ImageButton fourLevel;
    ImageButton fiveLevel;
    ImageButton backButton;

    public ChoiceScreen(final StartClass startClass){
        this.startClass = startClass;
        stage = new Stage(new ScreenViewport());

        backgroundImage = new Image(new Texture("blueBackGround.jpg"));
        backgroundImage.setPosition(0, 0);
        backgroundImage.setSize(StartClass.WIDTH, StartClass.HEIGHT);

        grassImage = new Image( new Texture("grass.JPEG"));
        grassImage.setPosition(0, -50);

        sittingLamaImage = new Image(new Texture("sittingLama.png"));
        sittingLamaImage.setPosition(StartClass.WIDTH/2-sittingLamaImage.getWidth()/2, 70);

        choiceLabel = new Label("Choose difficulty", new Label.LabelStyle(startClass.whiteFont, Color.WHITE));
        choiceLabel.setPosition(StartClass.WIDTH/2-choiceLabel.getWidth()/2, StartClass.HEIGHT/2+120);

        Drawable oneLevelDrawable = new TextureRegionDrawable(new TextureRegion(new Texture("uiskins/oneLevel.png")));
        oneLevel = new ImageButton(oneLevelDrawable);
        oneLevel.setPosition(50, StartClass.HEIGHT/2-oneLevel.getHeight());
        oneLevel.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                dispose();
                startClass.setGameMode(1);
                startClass.setGameScreen();
            }
        });

        Drawable twoLevelDrawable = new TextureRegionDrawable(new TextureRegion(new Texture("uiskins/twoLevel.png")));
        twoLevel = new ImageButton(twoLevelDrawable);
        twoLevel.setPosition(133, StartClass.HEIGHT/2-twoLevel.getHeight());
        twoLevel.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                dispose();
                startClass.setGameMode(2);
                startClass.setGameScreen();
            }
        });

        Drawable threeDrawable = new TextureRegionDrawable(new TextureRegion(new Texture("uiskins/threeLevel.png")));
        threeLevel = new ImageButton(threeDrawable);
        threeLevel.setPosition(216, StartClass.HEIGHT/2-threeLevel.getHeight());
        threeLevel.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                dispose();
                startClass.setGameMode(3);
                startClass.setGameScreen();
            }
        });

        Drawable fourLevelDrawable = new TextureRegionDrawable(new TextureRegion(new Texture("uiskins/fourLevel.png")));
        fourLevel = new ImageButton(fourLevelDrawable);
        fourLevel.setPosition(299, StartClass.HEIGHT/2-fourLevel.getHeight());
        fourLevel.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                dispose();
                startClass.setGameMode(4);
                startClass.setGameScreen();
            }
        });

        Drawable fiveLevelDrawable = new TextureRegionDrawable(new TextureRegion(new Texture("uiskins/fiveLevel.png")));
        fiveLevel = new ImageButton(fiveLevelDrawable);
        fiveLevel.setPosition(382, StartClass.HEIGHT/2-fiveLevel.getHeight());
        fiveLevel.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                dispose();
                startClass.setGameMode(5);
                startClass.setGameScreen();
            }
        });

        Drawable backDrawable = new TextureRegionDrawable(new TextureRegion(new Texture("uiskins/homeButton.png")));
        backButton = new ImageButton(backDrawable);
        backButton.setPosition(7, StartClass.HEIGHT-7-backButton.getHeight());
        backButton.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                dispose();
                startClass.setMenuScreen();
            }
        });

        stage.addActor(backgroundImage);
        stage.addActor(grassImage);
        stage.addActor(sittingLamaImage);
        stage.addActor(choiceLabel);
        stage.addActor(oneLevel);
        stage.addActor(twoLevel);
        stage.addActor(threeLevel);
        stage.addActor(fourLevel);
        stage.addActor(fiveLevel);
        stage.addActor(backButton);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
