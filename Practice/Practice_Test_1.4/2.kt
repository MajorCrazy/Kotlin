fun moveRobot(r: Robot, toX: Int, toY: Int) {
        while (r.x != toX || r.y != toY) {
            while(r.x != toX) {
                if (r.x < toX) {
                    while (r.direction != Direction.RIGHT) {
                        r.turnRight()
                    }
                    r.stepForward()
                }
                else {
                    while (r.direction != Direction.LEFT) {
                        r.turnLeft()
                    }
                    r.stepForward()
                }
            }

            while(r.y != toY) {
                if (r.y < toY) {
                    while (r.direction != Direction.UP) {
                        r.turnRight()
                    }
                    r.stepForward()
                }
                else {
                    while (r.direction != Direction.DOWN) {
                        r.turnLeft()
                    }
                    r.stepForward()
                }
            }
        }
    }
