$input a_position, a_color0
$output v_color0

/*
 * Copyright 2011-2021 Branimir Karadzic. All rights reserved.
 * License: https://github.com/bkaradzic/bgfx#license-bsd-2-clause
 */

#include "../common/common.sh"

#define CNUM 1.5574

void main()
{
	vec4 pos = mul(u_modelViewProj, vec4(a_position, 1.0) );
	float posX = pos.x / pos.w;
	float posY = pos.y / pos.w;
	/*gl_Position = vec4(atan(posX * CNUM) , atan(posY * CNUM) , pos.z/ pos.w , 1.0);*/
	gl_Position = pos;
	v_color0 = a_color0;
}
