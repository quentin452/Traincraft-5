//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.08.2020 - 13:35:58
// Last changed on: 03.08.2020 - 13:35:58

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelClass230 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelClass230() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[167];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 102, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 390, 89, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 241, 72, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY, "lamp"); // lamp
		bodyModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 461, 66, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 440, 66, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 481, 66, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 481, 87, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 65, 80, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 65, 90, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 224, 104, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 281, 83, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 281, 76, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 281, 2, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 487, 41, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 400, 49, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 77
		bodyModel[59] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		bodyModel[60] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 83
		bodyModel[65] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 84
		bodyModel[66] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 1
		bodyModel[70] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 3
		bodyModel[72] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 4
		bodyModel[73] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 5
		bodyModel[74] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 93
		bodyModel[87] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 94
		bodyModel[88] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 95
		bodyModel[89] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 97
		bodyModel[91] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 98
		bodyModel[92] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 99
		bodyModel[93] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 100
		bodyModel[94] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 101
		bodyModel[95] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 102
		bodyModel[96] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 103
		bodyModel[97] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 104
		bodyModel[98] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 105
		bodyModel[99] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 106
		bodyModel[100] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 107
		bodyModel[101] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 108
		bodyModel[102] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 109
		bodyModel[103] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 110
		bodyModel[104] = new ModelRendererTurbo(this, 113, 61, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 112
		bodyModel[106] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 113
		bodyModel[107] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
		bodyModel[108] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 217, 72, textureX, textureY); // Box 118
		bodyModel[110] = new ModelRendererTurbo(this, 193, 72, textureX, textureY); // Box 119
		bodyModel[111] = new ModelRendererTurbo(this, 257, 72, textureX, textureY); // Box 120
		bodyModel[112] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 1, 87, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 28, 96, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 28, 99, textureX, textureY); // Box 125
		bodyModel[117] = new ModelRendererTurbo(this, 28, 96, textureX, textureY); // Box 126
		bodyModel[118] = new ModelRendererTurbo(this, 28, 99, textureX, textureY); // Box 127
		bodyModel[119] = new ModelRendererTurbo(this, 28, 96, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 28, 99, textureX, textureY); // Box 129
		bodyModel[121] = new ModelRendererTurbo(this, 28, 96, textureX, textureY); // Box 130
		bodyModel[122] = new ModelRendererTurbo(this, 28, 99, textureX, textureY); // Box 131
		bodyModel[123] = new ModelRendererTurbo(this, 24, 73, textureX, textureY); // Box 132
		bodyModel[124] = new ModelRendererTurbo(this, 461, 87, textureX, textureY); // Box 14
		bodyModel[125] = new ModelRendererTurbo(this, 440, 87, textureX, textureY); // Box 15
		bodyModel[126] = new ModelRendererTurbo(this, 415, 66, textureX, textureY); // Box 18
		bodyModel[127] = new ModelRendererTurbo(this, 415, 87, textureX, textureY); // Box 22
		bodyModel[128] = new ModelRendererTurbo(this, 461, 108, textureX, textureY); // Box 14
		bodyModel[129] = new ModelRendererTurbo(this, 440, 108, textureX, textureY); // Box 15
		bodyModel[130] = new ModelRendererTurbo(this, 379, 89, textureX, textureY); // Box 18
		bodyModel[131] = new ModelRendererTurbo(this, 481, 108, textureX, textureY); // Box 22
		bodyModel[132] = new ModelRendererTurbo(this, 113, 70, textureX, textureY); // Box 111
		bodyModel[133] = new ModelRendererTurbo(this, 132, 70, textureX, textureY); // Box 111
		bodyModel[134] = new ModelRendererTurbo(this, 16, 73, textureX, textureY, "lamp"); // lamp
		bodyModel[135] = new ModelRendererTurbo(this, 1, 73, textureX, textureY, "lamp"); // lamp
		bodyModel[136] = new ModelRendererTurbo(this, 16, 73, textureX, textureY, "lamp"); // lamp
		bodyModel[137] = new ModelRendererTurbo(this, 136, 72, textureX, textureY); // Box 111
		bodyModel[138] = new ModelRendererTurbo(this, 148, 70, textureX, textureY); // Box 111
		bodyModel[139] = new ModelRendererTurbo(this, 136, 72, textureX, textureY); // Box 111
		bodyModel[140] = new ModelRendererTurbo(this, 148, 70, textureX, textureY); // Box 111
		bodyModel[141] = new ModelRendererTurbo(this, 285, 6, textureX, textureY); // Box 39
		bodyModel[142] = new ModelRendererTurbo(this, 211, 77, textureX, textureY); // Box 112
		bodyModel[143] = new ModelRendererTurbo(this, 200, 98, textureX, textureY); // Box 112
		bodyModel[144] = new ModelRendererTurbo(this, 200, 98, textureX, textureY); // Box 112
		bodyModel[145] = new ModelRendererTurbo(this, 211, 77, textureX, textureY); // Box 112
		bodyModel[146] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 44
		bodyModel[147] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[148] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 46
		bodyModel[149] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 47
		bodyModel[150] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 48
		bodyModel[151] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 49
		bodyModel[152] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 59
		bodyModel[153] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 62
		bodyModel[154] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 64
		bodyModel[155] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 68
		bodyModel[156] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 74
		bodyModel[157] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 75
		bodyModel[158] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 77
		bodyModel[159] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		bodyModel[160] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 79
		bodyModel[161] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 80
		bodyModel[162] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 81
		bodyModel[163] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 82
		bodyModel[164] = new ModelRendererTurbo(this, 281, 11, textureX, textureY); // Box 39
		bodyModel[165] = new ModelRendererTurbo(this, 281, 11, textureX, textureY); // Box 39
		bodyModel[166] = new ModelRendererTurbo(this, 40, 72, textureX, textureY); // Box 11

		bodyModel[0].addShapeBox(0F, 0F, 0F, 64, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-32F, 4F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-33F, -14F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-33F, -14F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 6
		bodyModel[3].setRotationPoint(-33F, -13F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(31.75F, -13F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 10
		bodyModel[5].setRotationPoint(-33F, -14F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.2F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, -3.9F, -0.2F, -3.9F, -3.9F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, -0.2F, 0F, -3.9F); // lamp
		bodyModel[6].setRotationPoint(-33.5F, -4.7F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 18, 20, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(-27F, -14F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(-20F, -14F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[9].setRotationPoint(-20F, -14F, 9.25F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[10].setRotationPoint(-13F, -14F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-13F, -14F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 21, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(-32F, -15F, -10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(-33F, -17F, -10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 59, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(-27F, -15F, -10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 59, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(-27F, -15F, 9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[16].setRotationPoint(-33F, -17F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[17].setRotationPoint(-33F, -17F, -8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(32F, -17F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[19].setRotationPoint(32F, -17F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(32F, -17F, 8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 66, 1, 17, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 35
		bodyModel[21].setRotationPoint(-33F, -18F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 64, 3, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-32F, -17F, 9.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 64, 3, 1, 0F,0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 37
		bodyModel[23].setRotationPoint(-32F, -17F, -10.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 38
		bodyModel[24].setRotationPoint(-27F, -17F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 39
		bodyModel[25].setRotationPoint(-33F, 4F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 40
		bodyModel[26].setRotationPoint(-26F, 4F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-26F, 4F, 10F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 44
		bodyModel[28].setRotationPoint(16F, -2F, 5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 45
		bodyModel[29].setRotationPoint(16F, -2F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 46
		bodyModel[30].setRotationPoint(4F, -2F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[31].setRotationPoint(4F, 1F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[32].setRotationPoint(4F, 1F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 49
		bodyModel[33].setRotationPoint(4F, -2F, 5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 50
		bodyModel[34].setRotationPoint(-21F, -2F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[35].setRotationPoint(-26F, 1F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(-26F, 1F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 53
		bodyModel[37].setRotationPoint(-21F, -2F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 54
		bodyModel[38].setRotationPoint(22F, 1F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 55
		bodyModel[39].setRotationPoint(22F, -2F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 56
		bodyModel[40].setRotationPoint(22F, -2F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(22F, 1F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(23F, 0F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(5F, 0F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[44].setRotationPoint(-26F, 0F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(-26F, 0F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(5F, 0F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(23F, 0F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[48].setRotationPoint(5F, -4F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 65
		bodyModel[49].setRotationPoint(-26F, -4F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 66
		bodyModel[50].setRotationPoint(23F, -4F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(23F, -4F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[52].setRotationPoint(5F, -4F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(-26F, -4F, 9F);

		bodyModel[54].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 72
		bodyModel[54].setRotationPoint(27F, -3F, -5F);
		bodyModel[54].rotateAngleX = 0.10471976F;

		bodyModel[55].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 73
		bodyModel[55].setRotationPoint(27F, -3F, 5F);
		bodyModel[55].rotateAngleX = -0.08726646F;

		bodyModel[56].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 74
		bodyModel[56].setRotationPoint(12.5F, -3F, -5F);
		bodyModel[56].rotateAngleX = 0.10471976F;

		bodyModel[57].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 75
		bodyModel[57].setRotationPoint(8.5F, -3F, -5F);
		bodyModel[57].rotateAngleX = 0.10471976F;

		bodyModel[58].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 77
		bodyModel[58].setRotationPoint(12.5F, -3F, 5F);
		bodyModel[58].rotateAngleX = -0.08726646F;

		bodyModel[59].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 78
		bodyModel[59].setRotationPoint(8.5F, -3F, 5F);
		bodyModel[59].rotateAngleX = -0.08726646F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[60].setRotationPoint(4.5F, -16F, 4.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[61].setRotationPoint(16.5F, -16F, 4.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[62].setRotationPoint(16.5F, -16F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[63].setRotationPoint(4.5F, -16F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[64].setRotationPoint(-20.5F, -16F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[65].setRotationPoint(-20.5F, -16F, 4.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[66].setRotationPoint(22.5F, -16F, 4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[67].setRotationPoint(22.5F, -16F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		bodyModel[68].setRotationPoint(-17.75F, 5F, 5F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[69].setRotationPoint(-28.25F, 5F, 5F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
		bodyModel[70].setRotationPoint(-17.75F, 5F, -5F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
		bodyModel[71].setRotationPoint(-28.25F, 5F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[72].setRotationPoint(-15.75F, 7F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
		bodyModel[73].setRotationPoint(-26.25F, 7F, -6F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 81
		bodyModel[74].setRotationPoint(-17F, 6F, 6F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 82
		bodyModel[75].setRotationPoint(-26F, 6F, 6F);

		bodyModel[76].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 83
		bodyModel[76].setRotationPoint(-25F, 6F, 7F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 84
		bodyModel[77].setRotationPoint(-27.25F, 6F, 2F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 85
		bodyModel[78].setRotationPoint(-16.75F, 6F, -2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[79].setRotationPoint(-24.25F, 6F, -2F);

		bodyModel[80].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 87
		bodyModel[80].setRotationPoint(-25F, 6F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 88
		bodyModel[81].setRotationPoint(-26F, 6F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 89
		bodyModel[82].setRotationPoint(-17F, 6F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 90
		bodyModel[83].setRotationPoint(-22F, 5F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 91
		bodyModel[84].setRotationPoint(-19F, 5F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[85].setRotationPoint(-7F, 5F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 93
		bodyModel[86].setRotationPoint(16F, 6F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 94
		bodyModel[87].setRotationPoint(15F, 6F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		bodyModel[88].setRotationPoint(14.75F, 7F, -6F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 96
		bodyModel[89].setRotationPoint(12.75F, 5F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[90].setRotationPoint(16.75F, 6F, -2F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 98
		bodyModel[91].setRotationPoint(13.75F, 6F, 2F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 99
		bodyModel[92].setRotationPoint(12.75F, 5F, 5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 100
		bodyModel[93].setRotationPoint(15F, 6F, 6F);

		bodyModel[94].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 101
		bodyModel[94].setRotationPoint(16F, 6F, 7F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 102
		bodyModel[95].setRotationPoint(24F, 6F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 103
		bodyModel[96].setRotationPoint(25.25F, 7F, -6F);

		bodyModel[97].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 104
		bodyModel[97].setRotationPoint(23.25F, 5F, 5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
		bodyModel[98].setRotationPoint(22F, 5F, 6F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 106
		bodyModel[99].setRotationPoint(24.25F, 6F, -2F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 107
		bodyModel[100].setRotationPoint(24F, 6F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 108
		bodyModel[101].setRotationPoint(19F, 5F, -7F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 109
		bodyModel[102].setRotationPoint(23.25F, 5F, -5F);

		bodyModel[103].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 110
		bodyModel[103].setRotationPoint(-2.5F, 5F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 111
		bodyModel[104].setRotationPoint(-32F, 5F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[105].setRotationPoint(31F, 5F, -1F);

		bodyModel[106].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 113
		bodyModel[106].setRotationPoint(-7.5F, 5F, 5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[107].setRotationPoint(4F, 5F, 5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 117
		bodyModel[108].setRotationPoint(30F, 5F, -3.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 118
		bodyModel[109].setRotationPoint(32F, -13F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 119
		bodyModel[110].setRotationPoint(32F, -13F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 120
		bodyModel[111].setRotationPoint(32F, -14F, -9.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 121
		bodyModel[112].setRotationPoint(-20.5F, 5F, 0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 122
		bodyModel[113].setRotationPoint(20.5F, 5F, 0.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 123
		bodyModel[114].setRotationPoint(14F, -18.25F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 124
		bodyModel[115].setRotationPoint(8F, -18.5F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[116].setRotationPoint(8F, -21F, -5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 126
		bodyModel[117].setRotationPoint(8F, -18.5F, 5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[118].setRotationPoint(8F, -21F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[119].setRotationPoint(20F, -18.5F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 129
		bodyModel[120].setRotationPoint(19F, -21F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[121].setRotationPoint(20F, -18.5F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 131
		bodyModel[122].setRotationPoint(19F, -21F, -5F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 132
		bodyModel[123].setRotationPoint(16F, -23.25F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[124].setRotationPoint(-2F, -14F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[125].setRotationPoint(-2F, -14F, 9.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[126].setRotationPoint(5F, -14F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[127].setRotationPoint(5F, -14F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[128].setRotationPoint(16F, -14F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[129].setRotationPoint(16F, -14F, 9.25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[130].setRotationPoint(23F, -14F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[131].setRotationPoint(23F, -14F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[132].setRotationPoint(-34F, 5F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[133].setRotationPoint(-35F, 5.6F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.2F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, -3.6F, -0.2F, -3.6F, -3.6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, -0.2F, 0F, -3.6F); // lamp
		bodyModel[134].setRotationPoint(-33.5F, -5.8F, -9.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.2F, -3.9F, -3.9F, 0F, -3.9F, -3.9F, 0F, -3.9F, 0F, -0.2F, -3.9F, 0F, -0.2F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, -0.2F, 0F, 0F); // lamp
		bodyModel[135].setRotationPoint(-33.5F, -4.7F, 3.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.2F, -3.6F, -3.6F, 0F, -3.6F, -3.6F, 0F, -3.6F, 0F, -0.2F, -3.6F, 0F, -0.2F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, -0.2F, 0F, 0F); // lamp
		bodyModel[136].setRotationPoint(-33.5F, -5.8F, 4.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F); // Box 111
		bodyModel[137].setRotationPoint(-32F, 7F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-1.3F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.2F, -1.5F, 0F, -0.9F, -1.5F, 0F, -0.2F, -1F, -0.7F, -0.7F, -1F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[138].setRotationPoint(-32F, 5F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[139].setRotationPoint(-32F, 7F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.9F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.5F, -0.5F, 0F, -1.3F, -0.5F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1F, -0.7F, -0.2F, -1F, -0.7F); // Box 111
		bodyModel[140].setRotationPoint(-32F, 5F, 4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.8F, 1F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, 0F, -0.8F, 1F, 0F, 1.2F, 0.5F, 0F, -2.6F, 1.7F, 0F, -2.6F, 1.7F, 0F, 1.2F, 0.5F, 0F); // Box 39
		bodyModel[141].setRotationPoint(-30F, 6F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[142].setRotationPoint(33F, -13F, -4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[143].setRotationPoint(33F, -14F, -4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[144].setRotationPoint(32F, 4F, -4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[145].setRotationPoint(33F, -13F, 3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 44
		bodyModel[146].setRotationPoint(-2F, -2F, 5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 45
		bodyModel[147].setRotationPoint(-2F, -2F, -10F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 46
		bodyModel[148].setRotationPoint(-14F, -2F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[149].setRotationPoint(-14F, 1F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[150].setRotationPoint(-14F, 1F, 7F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 49
		bodyModel[151].setRotationPoint(-14F, -2F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[152].setRotationPoint(-13F, 0F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[153].setRotationPoint(-13F, 0F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[154].setRotationPoint(-13F, -4F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[155].setRotationPoint(-13F, -4F, 9F);

		bodyModel[156].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 74
		bodyModel[156].setRotationPoint(-5.5F, -3F, -5F);
		bodyModel[156].rotateAngleX = 0.10471976F;

		bodyModel[157].addBox(0F, 0F, -4F, 0, 1, 4, 0F); // Box 75
		bodyModel[157].setRotationPoint(-9.5F, -3F, -5F);
		bodyModel[157].rotateAngleX = 0.10471976F;

		bodyModel[158].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 77
		bodyModel[158].setRotationPoint(-5.5F, -3F, 5F);
		bodyModel[158].rotateAngleX = -0.08726646F;

		bodyModel[159].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 78
		bodyModel[159].setRotationPoint(-9.5F, -3F, 5F);
		bodyModel[159].rotateAngleX = -0.08726646F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[160].setRotationPoint(-13.5F, -16F, 4.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[161].setRotationPoint(-1.5F, -16F, 4.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[162].setRotationPoint(-1.5F, -16F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[163].setRotationPoint(-13.5F, -16F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -0.7F, 0.5F, -2F, -0.7F, -1F, 0F, 0F, -1F, 0F); // Box 39
		bodyModel[164].setRotationPoint(-33F, 4F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 39
		bodyModel[165].setRotationPoint(-33F, 4F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, 0F, 0F, -8F); // Box 11
		bodyModel[166].setRotationPoint(-32.3F, -3.9F, -10F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 167; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}

}