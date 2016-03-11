


//NOTES

I've have actually made a living version of this guy. However I have yet to finish him completely (Has a lot more frames then this version)
I originally made these guys for a personal weapons and enemy mod, But I thought I should atleast finish some of them and release them.
Included in the decorate(Commented out however) are the states and lines for this actor to be able to fire 15 rounds and then reload.
Missing however the the sounds(Clip-In, Clip-Out, Slide back and slide release) and GFX(Shell Casings, Magazines and Actor GFX) for this
Also included is my original decorate that I like to use




Enemy Name; Undead Goon or Jawless Henchman (I am currently working on 4 other versions)
Heath; Originally had it set to 255(for use with custom weapons) however lowered to use with default doom weapons(80)
Attacks; Has two Missile States, One basic (fires one round), If enemy is closer than 192 units he will fire 5-6 shots in rapid(Semi-Auto)
which can be very painful for a player who get caught in CQB with this guy and doesn't have a weapon to take him down fast enough
Special; Has no Pain chance
Placement and use; To get the best use out of this enemy don't spam it like some do with the vanilla zombies in doom, Best used sparingly or as a special enconter, Maybe he has a kaycard? or maybe hidden in that armory? maybe leading the final group of mooks before the end boss?




//My original Version of the Decorate for use with certain weapons(I.e. Diaz Weapons or the ones I threw together) and enemies(The Rest of the human soldiers I'm working on)

ACTOR HalfMaskGoonUndead : Zombieman 20222 
{
 Health 255 //Zombies should not be weaker then their living counterparts, I hated that; They should be able to withstand more and have a real uneasy feel when combatting them
 OBITUARY "%o Found another Former Human"
 Mass 105
 Height 56
 Radius 20 
 SEESOUND "Jawless/sight"
 PAINSOUND ""
 DEATHSOUND ""
 ACTIVESOUND "Trespasser/Active"
 ATTACKSOUND "Gunshot/GLK"
 Speed 6
 ReactionTime 5
 PainChance 0 //NoPainChance
 GibHealth -500
 minmissilechance 2
 MONSTER
 +NOINFIGHTING
 +FloorClip
 +MissileMore
 +MissileEvenMore
 Decal BulletChip
DropItem ClipLying 100 1 
 DropItem Glock20Akimbo 64 1
  states
   {
	Spawn:
		TIPZ A 10 A_Look
		Loop
	See:
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
    THPZ AABBCCDD 4 A_Chase
    Loop
	Missile:
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ A 0 A_Jump(50,"Missile2")
	THPZ E 1 A_FaceTarget
	THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(9,9,1,8,1,0)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ E 1 A_FaceTarget
	Goto See
	Missile2:
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 7 A_FaceTarget
	THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(7,7,1,8,1,1024,1)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 6 A_FaceTarget
	THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(13,10,1,8,1,1024,1)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 7 A_FaceTarget
		THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(13,13,1,8,1,1024,1)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 6 A_FaceTarget
		THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(18,7,1,8,1,1024,1)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 4 A_FaceTarget
		THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(13,14,1,8,1,1024,1)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 6 A_FaceTarget
		THPZ E 0 A_GiveInventory("GruntClip1",1)
	THPZ F 2 BRIGHT A_CustomBulletAttack(9,9,1,8,1,1024,1)
	THPZ E 0 A_CustomMissile("WWPistolCasing",35,8,random(-35,-45),2,random(40,60))
	THPZ A 0 A_JumpIfInventory("GruntClip1",15,"Reload")
	THPZ E 6 A_FaceTarget
	Goto See
	Reload:
		THPZ E 15 A_PlaySound("Clipout/GLK")
		THPZ D 0 A_CustomMissile("MAG1Empty",32,10,random(260,280))
	    THPZ D 15 A_PlaySound("Clipin/GLK")
		THPZ E 0
        THPZ D 9 A_PlaySound("Slide/back2")
		THPZ D 9 A_PlaySound("Slide/forward2")
		THPZ E 0 A_TakeInventory("GruntClip1",15)
		Goto See
	 Pain:
        Goto See
    Death:
		THUG H 0 A_Jump(64,"Death2")
        THPZ H 5
		TNT1 AAA 0 A_CustomMissile("BloodDrop",32,0,random(-40,40),2,random(15,40))
        THPZ I 5 A_Scream
		TNT1 AAA 0 A_CustomMissile("BloodDrop",32,0,random(-40,40),2,random(15,40))
        THPZ J 2 A_PlaySound("Body/Fall/Back")
		TNT1 A 0 A_SpawnItem("BloodSpatter")
        THPZ JK 4 A_Fall
        THPZ L -1
        Stop
		Death2:
                THZP M 1 A_PlaySound("Body/Fall/Forward")
				TNT1 A 0 A_SpawnItem("BloodSpatter")
		THZP M 5
        THZP M 1 A_PlaySound("Jawless/HEADSHOT")
        THZP N 8 
        THZP O 5 A_Fall
		TNT1 AAA 0 A_CustomMissile("BloodDrop",32,0,random(-40,40),2,random(15,40))
        THZP P 5
        THZP Q -1
        Stop
    XDeath:
		THXZ A 5
        THXZ B 5 A_PlaySound("Jawless/XDEATH")
		TNT1 AAA 0 A_CustomMissile("BloodDrop",32,0,random(-40,40),2,random(15,40))
		TNT1 AAA 0 A_CustomMissile("BloodDrop",32,0,random(-40,40),2,random(15,40))
		TNT1 A 0 A_SpawnItem("BloodSpatter")
		TNT1 AAA 0 A_CustomMissile("ZombieGoonArm",40,-10,150)
        THXZ C 2 A_Fall
		THXZ C 2 A_PlaySound("Body/Fall/Back")
		TNT1 A 0 A_SpawnItem("BloodSpatter")
        THXZ DE 4
        THXZ F -1
    Stop
    Goto Death
    }
} 
