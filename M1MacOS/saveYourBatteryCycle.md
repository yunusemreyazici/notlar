## suggestions:


### 1 - Close screen time on the settings. Because this is battery 
exploiter.

### 2 - Close schedule activity's

##
- list your schedule activity
``
 pmset -g sched
``
##
-  cancel command
``
sudo pmset schedule cancelall 
``
### 3 - And then change hibernation mode from 3 to 25 via terminal

``
sudo pmset -a hibernatemode 25
``
##

Also disable screen time because this service constantly wakes up 
your macbook.

Instant wake won't be available, but since the ssd is fast anyway few more 
seconds when opening the lid will be nothing compared to losing so much 
battery while the lid was closed.

If you want to revert back, simply choose hibernatemode 3
``
sudo pmset -a hibernatemode 3
``
