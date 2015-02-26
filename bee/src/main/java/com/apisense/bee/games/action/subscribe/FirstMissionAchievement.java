package com.apisense.bee.games.action.subscribe;

import com.apisense.bee.games.BeeGameManager;
import com.apisense.bee.games.action.GameAchievement;
import com.google.android.gms.games.achievement.Achievement;

import fr.inria.asl.utils.Log;

/**
 * Created by Warnant on 19-02-15.
 */
public class FirstMissionAchievement extends GameAchievement implements MissionSuscribeAchievement {

    public FirstMissionAchievement(Achievement achievement) {
        super(achievement);
    }

    @Override
    public boolean process() {
        Log.getInstance().i("BeeFirstMission", "size=" + BeeGameManager.getInstance().getCurrentExperiments().size());
        return BeeGameManager.getInstance().getCurrentExperiments().size() >= 1;
    }

    @Override
    public int getScore() {
        return 1;
    }
}
