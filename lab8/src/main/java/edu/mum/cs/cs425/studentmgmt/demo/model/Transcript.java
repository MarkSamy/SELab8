package edu.mum.cs.cs425.studentmgmt.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "transcript")
public class Transcript {
    @Id
    @Column(name="transcriptId")
    private long transcriptId;
    @Column(name = "degreeTitle")
    private String degreeTitle;

    public long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "transcriptId=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +
                '}';
    }

    public Transcript() {
    }
    public Transcript(long transcriptId, String degreeTitle){
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
    }


}


