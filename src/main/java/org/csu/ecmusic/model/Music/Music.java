package org.csu.ecmusic.model.Music;

import java.awt.*;

/**
 * 音乐（乐谱）信息:
 *音乐编号
 * 音乐名称
 * 乐谱图片
 * 作者
 * 音乐种类
 * 难度等级
 * */

public class Music {

    private String musicId;
    private String musicName;
    private Image[] musicImgs;
    private String Author;
    private String musicType;
    private String musicLevel;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public Image[] getMusicImgs() {
        return musicImgs;
    }

    public void setMusicImgs(Image[] musicImgs) {
        this.musicImgs = musicImgs;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String getMusicLevel() {
        return musicLevel;
    }

    public void setMusicLevel(String musicLevel) {
        this.musicLevel = musicLevel;
    }
}
