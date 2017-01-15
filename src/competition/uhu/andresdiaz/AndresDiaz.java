package competition.uhu.andresdiaz;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.environments.Environment;

public class AndresDiaz extends BasicMarioAIAgent implements Agent
{
    int trueJumpCounter = 0;
    int trueSpeedCounter = 0;
    public AndresDiaz()
    {
        super("AndresDiaz");
        reset();
    }

    boolean lastKeySpeed = false;

    /*private boolean DangerOfAny()
    {

        if ((getReceptiveFieldCellValue(marioEgoRow + 2, marioEgoCol + 1) == 0 &&
                getReceptiveFieldCellValue(marioEgoRow + 1, marioEgoCol + 1) == 0) ||
                getReceptiveFieldCellValue(marioEgoRow, marioEgoCol + 1) != 0 ||
                getReceptiveFieldCellValue(marioEgoRow, marioEgoCol + 2) != 0 ||
                getEnemiesCellValue(marioEgoRow, marioEgoCol + 1) != 0 ||
                getEnemiesCellValue(marioEgoRow, marioEgoCol + 2) != 0)
            return true;
        else
            return false;
    }*/

    public boolean[] getAction()
    {
        action[Mario.KEY_JUMP] = isMarioAbleToJump;
        action[Mario.KEY_SPEED] = isMarioOnGround || isMarioAbleToShoot;
        action[Mario.KEY_RIGHT] = true;
        lastKeySpeed = action[Mario.KEY_SPEED];
        return action;
    }

    public void reset()
    {
    }
}
